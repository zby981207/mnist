import grpc
from concurrent import futures
# from cnstd import CnStd
# from cnocr import CnOcr
# import random

import com.qlisv.grpc.ocr.ocrapi_pb2 as ocrapi_pb2, com.qlisv.grpc.ocr.ocrapi_pb2_grpc as ocrapi_pb2_grpc





class OcrapiServicer(ocrapi_pb2_grpc.OcrapiServicer):

    def getText(self, request, ctx):
        _res = 'msg from server.getText'
        return ocrapi_pb2.ImgResponse(content=_res)

    def getImgText(self, request, context):
        _res = 'msg from server.getImgText'
        return ocrapi_pb2.ImgResponse(content=_res)


def main():
    # 服务端
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    # 实例化
    servicer = OcrapiServicer()
    # 注册本地服务
    ocrapi_pb2_grpc.add_OcrapiServicer_to_server(servicer, server)
    # 监听端口
    server.add_insecure_port('127.0.0.1:19999')
    # 开始接收请求进行服务
    server.start()
    # 使用 ctrl+c 可以退出服务
    try:
        print("running...")
        server.wait_for_termination()
    except KeyboardInterrupt:
        print("stopping...")
        server.stop(0)


if __name__ == '__main__':
    main()
