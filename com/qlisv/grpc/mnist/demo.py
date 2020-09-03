import torch
import torchvision.models as models

# pretrained=True就可以使用预训练的模型
pthfile = r'D:\mnist\com\qlisv\grpc\mnist\mnist_cnn.pt'
net = torch.load(pthfile)
print(net)