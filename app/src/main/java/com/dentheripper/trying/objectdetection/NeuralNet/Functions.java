package com.dentheripper.trying.objectdetection.NeuralNet;

class Functions {

    static float RandomFloat(float min, float max) {
        float a = (float) Math.random();
        float num = min + (float) Math.random() * (max - min);
        if(a < 0.5)
            return num;
        else
            return -num;
    }

    static float Sigmoid(float x) {
        return (float) (1/(1+Math.pow(Math.E, -x)));
    }

    float SigmoidDerivative(float x) {
        return Sigmoid(x)*(1-Sigmoid(x));
    }

    private float squaredError(float output, float target) {
        return (float) (0.5*Math.pow(2,(target-output)));
    }

    float sumSquaredError(float[] outputs,float[] targets) {
        float sum = 0;
        for(int i=0;i<outputs.length;i++) {
            sum += squaredError(outputs[i],targets[i]);
        }
        return sum;
    }
}
