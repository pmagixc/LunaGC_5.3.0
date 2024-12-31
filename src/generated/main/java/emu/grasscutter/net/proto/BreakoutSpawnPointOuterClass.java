// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BreakoutSpawnPoint.proto

package emu.grasscutter.net.proto;

public final class BreakoutSpawnPointOuterClass {
  private BreakoutSpawnPointOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BreakoutSpawnPointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BreakoutSpawnPoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    java.util.List<emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject> 
        getSpawnedBrickListList();
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject getSpawnedBrickList(int index);
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    int getSpawnedBrickListCount();
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder> 
        getSpawnedBrickListOrBuilderList();
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder getSpawnedBrickListOrBuilder(
        int index);

    /**
     * <code>uint32 brick_suite_id = 2;</code>
     * @return The brickSuiteId.
     */
    int getBrickSuiteId();

    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code BreakoutSpawnPoint}
   */
  public static final class BreakoutSpawnPoint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BreakoutSpawnPoint)
      BreakoutSpawnPointOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BreakoutSpawnPoint.newBuilder() to construct.
    private BreakoutSpawnPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BreakoutSpawnPoint() {
      spawnedBrickList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BreakoutSpawnPoint();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BreakoutSpawnPoint(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              id_ = input.readUInt32();
              break;
            }
            case 16: {

              brickSuiteId_ = input.readUInt32();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                spawnedBrickList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject>();
                mutable_bitField0_ |= 0x00000001;
              }
              spawnedBrickList_.add(
                  input.readMessage(emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          spawnedBrickList_ = java.util.Collections.unmodifiableList(spawnedBrickList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.internal_static_BreakoutSpawnPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.internal_static_BreakoutSpawnPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint.class, emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint.Builder.class);
    }

    public static final int SPAWNED_BRICK_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject> spawnedBrickList_;
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject> getSpawnedBrickListList() {
      return spawnedBrickList_;
    }
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder> 
        getSpawnedBrickListOrBuilderList() {
      return spawnedBrickList_;
    }
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    @java.lang.Override
    public int getSpawnedBrickListCount() {
      return spawnedBrickList_.size();
    }
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject getSpawnedBrickList(int index) {
      return spawnedBrickList_.get(index);
    }
    /**
     * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder getSpawnedBrickListOrBuilder(
        int index) {
      return spawnedBrickList_.get(index);
    }

    public static final int BRICK_SUITE_ID_FIELD_NUMBER = 2;
    private int brickSuiteId_;
    /**
     * <code>uint32 brick_suite_id = 2;</code>
     * @return The brickSuiteId.
     */
    @java.lang.Override
    public int getBrickSuiteId() {
      return brickSuiteId_;
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (brickSuiteId_ != 0) {
        output.writeUInt32(2, brickSuiteId_);
      }
      for (int i = 0; i < spawnedBrickList_.size(); i++) {
        output.writeMessage(3, spawnedBrickList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (brickSuiteId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, brickSuiteId_);
      }
      for (int i = 0; i < spawnedBrickList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, spawnedBrickList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint other = (emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint) obj;

      if (!getSpawnedBrickListList()
          .equals(other.getSpawnedBrickListList())) return false;
      if (getBrickSuiteId()
          != other.getBrickSuiteId()) return false;
      if (getId()
          != other.getId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getSpawnedBrickListCount() > 0) {
        hash = (37 * hash) + SPAWNED_BRICK_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnedBrickListList().hashCode();
      }
      hash = (37 * hash) + BRICK_SUITE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBrickSuiteId();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BreakoutSpawnPoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BreakoutSpawnPoint)
        emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.internal_static_BreakoutSpawnPoint_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.internal_static_BreakoutSpawnPoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint.class, emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getSpawnedBrickListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (spawnedBrickListBuilder_ == null) {
          spawnedBrickList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          spawnedBrickListBuilder_.clear();
        }
        brickSuiteId_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.internal_static_BreakoutSpawnPoint_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint build() {
        emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint buildPartial() {
        emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint result = new emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint(this);
        int from_bitField0_ = bitField0_;
        if (spawnedBrickListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            spawnedBrickList_ = java.util.Collections.unmodifiableList(spawnedBrickList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.spawnedBrickList_ = spawnedBrickList_;
        } else {
          result.spawnedBrickList_ = spawnedBrickListBuilder_.build();
        }
        result.brickSuiteId_ = brickSuiteId_;
        result.id_ = id_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint) {
          return mergeFrom((emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint other) {
        if (other == emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint.getDefaultInstance()) return this;
        if (spawnedBrickListBuilder_ == null) {
          if (!other.spawnedBrickList_.isEmpty()) {
            if (spawnedBrickList_.isEmpty()) {
              spawnedBrickList_ = other.spawnedBrickList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSpawnedBrickListIsMutable();
              spawnedBrickList_.addAll(other.spawnedBrickList_);
            }
            onChanged();
          }
        } else {
          if (!other.spawnedBrickList_.isEmpty()) {
            if (spawnedBrickListBuilder_.isEmpty()) {
              spawnedBrickListBuilder_.dispose();
              spawnedBrickListBuilder_ = null;
              spawnedBrickList_ = other.spawnedBrickList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              spawnedBrickListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSpawnedBrickListFieldBuilder() : null;
            } else {
              spawnedBrickListBuilder_.addAllMessages(other.spawnedBrickList_);
            }
          }
        }
        if (other.getBrickSuiteId() != 0) {
          setBrickSuiteId(other.getBrickSuiteId());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject> spawnedBrickList_ =
        java.util.Collections.emptyList();
      private void ensureSpawnedBrickListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          spawnedBrickList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject>(spawnedBrickList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder> spawnedBrickListBuilder_;

      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject> getSpawnedBrickListList() {
        if (spawnedBrickListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(spawnedBrickList_);
        } else {
          return spawnedBrickListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public int getSpawnedBrickListCount() {
        if (spawnedBrickListBuilder_ == null) {
          return spawnedBrickList_.size();
        } else {
          return spawnedBrickListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject getSpawnedBrickList(int index) {
        if (spawnedBrickListBuilder_ == null) {
          return spawnedBrickList_.get(index);
        } else {
          return spawnedBrickListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder setSpawnedBrickList(
          int index, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject value) {
        if (spawnedBrickListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSpawnedBrickListIsMutable();
          spawnedBrickList_.set(index, value);
          onChanged();
        } else {
          spawnedBrickListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder setSpawnedBrickList(
          int index, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder builderForValue) {
        if (spawnedBrickListBuilder_ == null) {
          ensureSpawnedBrickListIsMutable();
          spawnedBrickList_.set(index, builderForValue.build());
          onChanged();
        } else {
          spawnedBrickListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder addSpawnedBrickList(emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject value) {
        if (spawnedBrickListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSpawnedBrickListIsMutable();
          spawnedBrickList_.add(value);
          onChanged();
        } else {
          spawnedBrickListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder addSpawnedBrickList(
          int index, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject value) {
        if (spawnedBrickListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSpawnedBrickListIsMutable();
          spawnedBrickList_.add(index, value);
          onChanged();
        } else {
          spawnedBrickListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder addSpawnedBrickList(
          emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder builderForValue) {
        if (spawnedBrickListBuilder_ == null) {
          ensureSpawnedBrickListIsMutable();
          spawnedBrickList_.add(builderForValue.build());
          onChanged();
        } else {
          spawnedBrickListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder addSpawnedBrickList(
          int index, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder builderForValue) {
        if (spawnedBrickListBuilder_ == null) {
          ensureSpawnedBrickListIsMutable();
          spawnedBrickList_.add(index, builderForValue.build());
          onChanged();
        } else {
          spawnedBrickListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder addAllSpawnedBrickList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject> values) {
        if (spawnedBrickListBuilder_ == null) {
          ensureSpawnedBrickListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, spawnedBrickList_);
          onChanged();
        } else {
          spawnedBrickListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder clearSpawnedBrickList() {
        if (spawnedBrickListBuilder_ == null) {
          spawnedBrickList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          spawnedBrickListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public Builder removeSpawnedBrickList(int index) {
        if (spawnedBrickListBuilder_ == null) {
          ensureSpawnedBrickListIsMutable();
          spawnedBrickList_.remove(index);
          onChanged();
        } else {
          spawnedBrickListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder getSpawnedBrickListBuilder(
          int index) {
        return getSpawnedBrickListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder getSpawnedBrickListOrBuilder(
          int index) {
        if (spawnedBrickListBuilder_ == null) {
          return spawnedBrickList_.get(index);  } else {
          return spawnedBrickListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder> 
           getSpawnedBrickListOrBuilderList() {
        if (spawnedBrickListBuilder_ != null) {
          return spawnedBrickListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(spawnedBrickList_);
        }
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder addSpawnedBrickListBuilder() {
        return getSpawnedBrickListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.getDefaultInstance());
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder addSpawnedBrickListBuilder(
          int index) {
        return getSpawnedBrickListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.getDefaultInstance());
      }
      /**
       * <code>repeated .BreakoutPhysicalObject spawned_brick_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder> 
           getSpawnedBrickListBuilderList() {
        return getSpawnedBrickListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder> 
          getSpawnedBrickListFieldBuilder() {
        if (spawnedBrickListBuilder_ == null) {
          spawnedBrickListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObject.Builder, emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.BreakoutPhysicalObjectOrBuilder>(
                  spawnedBrickList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          spawnedBrickList_ = null;
        }
        return spawnedBrickListBuilder_;
      }

      private int brickSuiteId_ ;
      /**
       * <code>uint32 brick_suite_id = 2;</code>
       * @return The brickSuiteId.
       */
      @java.lang.Override
      public int getBrickSuiteId() {
        return brickSuiteId_;
      }
      /**
       * <code>uint32 brick_suite_id = 2;</code>
       * @param value The brickSuiteId to set.
       * @return This builder for chaining.
       */
      public Builder setBrickSuiteId(int value) {
        
        brickSuiteId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 brick_suite_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBrickSuiteId() {
        
        brickSuiteId_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BreakoutSpawnPoint)
    }

    // @@protoc_insertion_point(class_scope:BreakoutSpawnPoint)
    private static final emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint();
    }

    public static emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BreakoutSpawnPoint>
        PARSER = new com.google.protobuf.AbstractParser<BreakoutSpawnPoint>() {
      @java.lang.Override
      public BreakoutSpawnPoint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BreakoutSpawnPoint(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BreakoutSpawnPoint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BreakoutSpawnPoint> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutSpawnPointOuterClass.BreakoutSpawnPoint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BreakoutSpawnPoint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BreakoutSpawnPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030BreakoutSpawnPoint.proto\032\034BreakoutPhys" +
      "icalObject.proto\"m\n\022BreakoutSpawnPoint\0223" +
      "\n\022spawned_brick_list\030\003 \003(\0132\027.BreakoutPhy" +
      "sicalObject\022\026\n\016brick_suite_id\030\002 \001(\r\022\n\n\002i" +
      "d\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.getDescriptor(),
        });
    internal_static_BreakoutSpawnPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BreakoutSpawnPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BreakoutSpawnPoint_descriptor,
        new java.lang.String[] { "SpawnedBrickList", "BrickSuiteId", "Id", });
    emu.grasscutter.net.proto.BreakoutPhysicalObjectOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
