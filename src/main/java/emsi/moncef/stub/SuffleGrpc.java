package emsi.moncef.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 *
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.15.0)",
        comments = "Source: signin.proto")
public final class SuffleGrpc {

    public static final String SERVICE_NAME = "Suffle";
    private static final int METHODID_SHUFFLE_WORDS = 0;
    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<emsi.moncef.stub.Signin.NamesRequest,
            emsi.moncef.stub.Signin.NamesResponse> getShuffleWordsMethod;
    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    private SuffleGrpc() {
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "ShuffleWords",
            requestType = emsi.moncef.stub.Signin.NamesRequest.class,
            responseType = emsi.moncef.stub.Signin.NamesResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
    public static io.grpc.MethodDescriptor<emsi.moncef.stub.Signin.NamesRequest,
            emsi.moncef.stub.Signin.NamesResponse> getShuffleWordsMethod() {
        io.grpc.MethodDescriptor<emsi.moncef.stub.Signin.NamesRequest, emsi.moncef.stub.Signin.NamesResponse> getShuffleWordsMethod;
        if ((getShuffleWordsMethod = SuffleGrpc.getShuffleWordsMethod) == null) {
            synchronized (SuffleGrpc.class) {
                if ((getShuffleWordsMethod = SuffleGrpc.getShuffleWordsMethod) == null) {
                    SuffleGrpc.getShuffleWordsMethod = getShuffleWordsMethod =
                            io.grpc.MethodDescriptor.<emsi.moncef.stub.Signin.NamesRequest, emsi.moncef.stub.Signin.NamesResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
                                    .setFullMethodName(generateFullMethodName(
                                            "Suffle", "ShuffleWords"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            emsi.moncef.stub.Signin.NamesRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            emsi.moncef.stub.Signin.NamesResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new SuffleMethodDescriptorSupplier("ShuffleWords"))
                                    .build();
                }
            }
        }
        return getShuffleWordsMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static SuffleStub newStub(io.grpc.Channel channel) {
        return new SuffleStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static SuffleBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new SuffleBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static SuffleFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new SuffleFutureStub(channel);
    }

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (SuffleGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new SuffleFileDescriptorSupplier())
                            .addMethod(getShuffleWordsMethod())
                            .build();
                }
            }
        }
        return result;
    }

    /**
     *
     */
    public static abstract class SuffleImplBase implements io.grpc.BindableService {

        /**
         *
         */
        public io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.NamesRequest> shuffleWords(
                io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.NamesResponse> responseObserver) {
            return asyncUnimplementedStreamingCall(getShuffleWordsMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getShuffleWordsMethod(),
                            asyncBidiStreamingCall(
                                    new MethodHandlers<
                                            emsi.moncef.stub.Signin.NamesRequest,
                                            emsi.moncef.stub.Signin.NamesResponse>(
                                            this, METHODID_SHUFFLE_WORDS)))
                    .build();
        }
    }

    /**
     *
     */
    public static final class SuffleStub extends io.grpc.stub.AbstractStub<SuffleStub> {
        private SuffleStub(io.grpc.Channel channel) {
            super(channel);
        }

        private SuffleStub(io.grpc.Channel channel,
                           io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SuffleStub build(io.grpc.Channel channel,
                                   io.grpc.CallOptions callOptions) {
            return new SuffleStub(channel, callOptions);
        }

        /**
         *
         */
        public io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.NamesRequest> shuffleWords(
                io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.NamesResponse> responseObserver) {
            return asyncBidiStreamingCall(
                    getChannel().newCall(getShuffleWordsMethod(), getCallOptions()), responseObserver);
        }
    }

    /**
     *
     */
    public static final class SuffleBlockingStub extends io.grpc.stub.AbstractStub<SuffleBlockingStub> {
        private SuffleBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private SuffleBlockingStub(io.grpc.Channel channel,
                                   io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SuffleBlockingStub build(io.grpc.Channel channel,
                                           io.grpc.CallOptions callOptions) {
            return new SuffleBlockingStub(channel, callOptions);
        }
    }

    /**
     *
     */
    public static final class SuffleFutureStub extends io.grpc.stub.AbstractStub<SuffleFutureStub> {
        private SuffleFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private SuffleFutureStub(io.grpc.Channel channel,
                                 io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SuffleFutureStub build(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            return new SuffleFutureStub(channel, callOptions);
        }
    }

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final SuffleImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(SuffleImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SHUFFLE_WORDS:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.shuffleWords(
                            (io.grpc.stub.StreamObserver<emsi.moncef.stub.Signin.NamesResponse>) responseObserver);
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class SuffleBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        SuffleBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return emsi.moncef.stub.Signin.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Suffle");
        }
    }

    private static final class SuffleFileDescriptorSupplier
            extends SuffleBaseDescriptorSupplier {
        SuffleFileDescriptorSupplier() {
        }
    }

    private static final class SuffleMethodDescriptorSupplier
            extends SuffleBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        SuffleMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }
}
