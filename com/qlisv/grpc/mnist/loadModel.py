import torch
from torchvision import datasets, transforms
import matplotlib.pyplot as plt
import os
import torchvision
import numpy as np
from torch.autograd import Variable
import com.qlisv.grpc.mnist.main as main

transform = transforms.Compose([transforms.ToTensor(),
                           transforms.Normalize((0.1307,), (0.3081,))])
data_test=datasets.MNIST("../data",
                           transform=transform,
                           train=False)

model=main.Net()

model.load_state_dict(torch.load("mnist_cnn.pt"))
model.eval()

data_loader_test=torch.utils.data.DataLoader(dataset=data_test,
                                               batch_size=4,
                                               shuffle=True)
X_test, y_test=next(iter(data_loader_test))
inputs=Variable(X_test)
pred=model(inputs)
_, pred=torch.max(pred, 1)

print("Predict Label is:", [i for i in pred.data])
print("Real Label is:", [i for i in y_test])

img=torchvision.utils.make_grid(X_test)
img=img.numpy().transpose(1, 2, 0)

std=[0.5, 0.5, 0.5]
mean=[0.5, 0.5, 0.5]
img=img*std+mean
plt.imshow(img)
