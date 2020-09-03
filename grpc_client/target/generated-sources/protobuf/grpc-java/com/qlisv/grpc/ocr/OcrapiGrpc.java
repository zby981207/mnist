package com.qlisv.grpc.ocr;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.0)",
    comments = "Source: ocrapi.proto")
public final class OcrapiGrpc {

  private OcrapiGrpc() {}

  public static final String SERVICE_NAME = "com.qlisv.grpc.ocr.Ocrapi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest,
      com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> getGetTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getText",
      requestType = com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest.class,
      responseType = com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest,
      com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> getGetTextMethod() {
    io.grpc.MethodDescriptor<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest, com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> getGetTextMethod;
    if ((getGetTextMethod = OcrapiGrpc.getGetTextMethod) == null) {
      synchronized (OcrapiGrpc.class) {
        if ((getGetTextMethod = OcrapiGrpc.getGetTextMethod) == null) {
          OcrapiGrpc.getGetTextMethod = getGetTextMethod =
              io.grpc.MethodDescriptor.<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest, com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OcrapiMethodDescriptorSupplier("getText"))
              .build();
        }
      }
    }
    return getGetTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest,
      com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> getGetImgTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getImgText",
      requestType = com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest.class,
      responseType = com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest,
      com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> getGetImgTextMethod() {
    io.grpc.MethodDescriptor<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest, com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> getGetImgTextMethod;
    if ((getGetImgTextMethod = OcrapiGrpc.getGetImgTextMethod) == null) {
      synchronized (OcrapiGrpc.class) {
        if ((getGetImgTextMethod = OcrapiGrpc.getGetImgTextMethod) == null) {
          OcrapiGrpc.getGetImgTextMethod = getGetImgTextMethod =
              io.grpc.MethodDescriptor.<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest, com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getImgText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OcrapiMethodDescriptorSupplier("getImgText"))
              .build();
        }
      }
    }
    return getGetImgTextMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OcrapiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OcrapiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OcrapiStub>() {
        @java.lang.Override
        public OcrapiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OcrapiStub(channel, callOptions);
        }
      };
    return OcrapiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OcrapiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OcrapiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OcrapiBlockingStub>() {
        @java.lang.Override
        public OcrapiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OcrapiBlockingStub(channel, callOptions);
        }
      };
    return OcrapiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OcrapiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OcrapiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OcrapiFutureStub>() {
        @java.lang.Override
        public OcrapiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OcrapiFutureStub(channel, callOptions);
        }
      };
    return OcrapiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OcrapiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 用于识别单色图片上的文字，不包含表情的图片
     * </pre>
     */
    public void getText(com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest request,
        io.grpc.stub.StreamObserver<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * 用于识别复杂的彩色图片上的文字
     * </pre>
     */
    public void getImgText(com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest request,
        io.grpc.stub.StreamObserver<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImgTextMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest,
                com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse>(
                  this, METHODID_GET_TEXT)))
          .addMethod(
            getGetImgTextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest,
                com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse>(
                  this, METHODID_GET_IMG_TEXT)))
          .build();
    }
  }

  /**
   */
  public static final class OcrapiStub extends io.grpc.stub.AbstractAsyncStub<OcrapiStub> {
    private OcrapiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OcrapiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OcrapiStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用于识别单色图片上的文字，不包含表情的图片
     * </pre>
     */
    public void getText(com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest request,
        io.grpc.stub.StreamObserver<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用于识别复杂的彩色图片上的文字
     * </pre>
     */
    public void getImgText(com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest request,
        io.grpc.stub.StreamObserver<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImgTextMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OcrapiBlockingStub extends io.grpc.stub.AbstractBlockingStub<OcrapiBlockingStub> {
    private OcrapiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OcrapiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OcrapiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用于识别单色图片上的文字，不包含表情的图片
     * </pre>
     */
    public com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse getText(com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用于识别复杂的彩色图片上的文字
     * </pre>
     */
    public com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse getImgText(com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImgTextMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OcrapiFutureStub extends io.grpc.stub.AbstractFutureStub<OcrapiFutureStub> {
    private OcrapiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OcrapiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OcrapiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 用于识别单色图片上的文字，不包含表情的图片
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> getText(
        com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 用于识别复杂的彩色图片上的文字
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse> getImgText(
        com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImgTextMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEXT = 0;
  private static final int METHODID_GET_IMG_TEXT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OcrapiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OcrapiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEXT:
          serviceImpl.getText((com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest) request,
              (io.grpc.stub.StreamObserver<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse>) responseObserver);
          break;
        case METHODID_GET_IMG_TEXT:
          serviceImpl.getImgText((com.qlisv.grpc.ocr.OcrapiOuterClass.ImgRequest) request,
              (io.grpc.stub.StreamObserver<com.qlisv.grpc.ocr.OcrapiOuterClass.ImgResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OcrapiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OcrapiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.qlisv.grpc.ocr.OcrapiOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Ocrapi");
    }
  }

  private static final class OcrapiFileDescriptorSupplier
      extends OcrapiBaseDescriptorSupplier {
    OcrapiFileDescriptorSupplier() {}
  }

  private static final class OcrapiMethodDescriptorSupplier
      extends OcrapiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OcrapiMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OcrapiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OcrapiFileDescriptorSupplier())
              .addMethod(getGetTextMethod())
              .addMethod(getGetImgTextMethod())
              .build();
        }
      }
    }
    return result;
  }
}
