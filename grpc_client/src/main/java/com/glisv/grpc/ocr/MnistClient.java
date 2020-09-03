package com.glisv.grpc.ocr;

import com.qlisv.grpc.ocr.OcrapiGrpc;
import com.qlisv.grpc.ocr.OcrapiOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class MnistClient {

    /**
     * 通过ocr获取图片上的文本
     *
     * @author AsyDong
     * @version 1.0
     * @time 2020/6/23 16:23
     */
    public static class OcrapiClient {

        private static final Logger logger = LoggerFactory.getLogger(OcrapiClient.class);

        private ManagedChannel channel;

        private String rpcOcrServer = "127.0.0.1:19999";

        /**
         * Construct client for accessing HelloWorld server using the existing channel.
         */
        public OcrapiClient() {
            this.channel = getChannel();
        }
        private OcrapiGrpc.OcrapiBlockingStub getBlockingStub() {
            // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
            OcrapiGrpc.OcrapiBlockingStub blockingStub = OcrapiGrpc.newBlockingStub(getChannel());
            return blockingStub;
        }
        private ManagedChannel getChannel() {
            if (channel == null || channel.isShutdown() || channel.isTerminated()) {
                // Create a communication channel to the server, known as a Channel. Channels are thread-safe
                // and reusable. It is common to create channels at the beginning of your application and reuse
                // them until the application shuts down.
                channel = ManagedChannelBuilder.forTarget(rpcOcrServer)
                        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                        // needing certificates.
                        .usePlaintext()
                        .build();
            }
            return channel;
        }
        private void closeChannel() {
            try {
                if (channel != null && !channel.isShutdown()) {
                    channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
                }
            } catch (InterruptedException e) {
                logger.error("通道关闭异常");
                e.printStackTrace();
            }
        }
        /**
         * 调用服务端的获取图像上的文本
         *
         * @param path 图片地址
         * @author AsyDong
         * @version 1.0
         * @time 2020/6/23 16:23
         */
        public String getText(String path) {
            logger.info(" try to connect server ...");
            try {
                OcrapiOuterClass.ImgRequest request = OcrapiOuterClass.ImgRequest.newBuilder().setImgPath(path).build();
                OcrapiOuterClass.ImgResponse response;
                response = getBlockingStub().getText(request);
                logger.info("提取结果: " + response.getContent());
                return response.getContent();
            } catch (StatusRuntimeException e) {
                logger.error("RPC failed: {0}", e.getStatus());
                return "";
            } finally {
                closeChannel();
            }
        }

        /**
         * Greet server. If provided, the first element of {@code args} is the name to use in the
         * greeting. The second argument is the target server.
         */
        public static void main(String[] args) throws Exception {
            String path = "D:/TMP/t1.png";
            OcrapiClient client = new OcrapiClient();
            System.out.println(client.getText(path));
        }
    }


}
