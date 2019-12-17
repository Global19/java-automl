/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/classification.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Contains annotation details specific to classification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.ClassificationAnnotation}
 */
public final class ClassificationAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.ClassificationAnnotation)
    ClassificationAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ClassificationAnnotation.newBuilder() to construct.
  private ClassificationAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ClassificationAnnotation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ClassificationAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ClassificationAnnotation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 13:
            {
              score_ = input.readFloat();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1.ClassificationProto
        .internal_static_google_cloud_automl_v1_ClassificationAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.ClassificationProto
        .internal_static_google_cloud_automl_v1_ClassificationAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.ClassificationAnnotation.class,
            com.google.cloud.automl.v1.ClassificationAnnotation.Builder.class);
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_;
  /**
   *
   *
   * <pre>
   * Output only. A confidence estimate between 0.0 and 1.0. A higher value
   * means greater confidence that the annotation is positive. If a user
   * approves an annotation as negative or positive, the score value remains
   * unchanged. If a user creates an annotation, the score is 0 for negative or
   * 1 for positive.
   * </pre>
   *
   * <code>float score = 1;</code>
   *
   * @return The score.
   */
  public float getScore() {
    return score_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (score_ != 0F) {
      output.writeFloat(1, score_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, score_);
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
    if (!(obj instanceof com.google.cloud.automl.v1.ClassificationAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.ClassificationAnnotation other =
        (com.google.cloud.automl.v1.ClassificationAnnotation) obj;

    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(other.getScore())) return false;
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.automl.v1.ClassificationAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Contains annotation details specific to classification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.ClassificationAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.ClassificationAnnotation)
      com.google.cloud.automl.v1.ClassificationAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.ClassificationProto
          .internal_static_google_cloud_automl_v1_ClassificationAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.ClassificationProto
          .internal_static_google_cloud_automl_v1_ClassificationAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.ClassificationAnnotation.class,
              com.google.cloud.automl.v1.ClassificationAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.ClassificationAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      score_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.ClassificationProto
          .internal_static_google_cloud_automl_v1_ClassificationAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ClassificationAnnotation getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.ClassificationAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ClassificationAnnotation build() {
      com.google.cloud.automl.v1.ClassificationAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ClassificationAnnotation buildPartial() {
      com.google.cloud.automl.v1.ClassificationAnnotation result =
          new com.google.cloud.automl.v1.ClassificationAnnotation(this);
      result.score_ = score_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1.ClassificationAnnotation) {
        return mergeFrom((com.google.cloud.automl.v1.ClassificationAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.ClassificationAnnotation other) {
      if (other == com.google.cloud.automl.v1.ClassificationAnnotation.getDefaultInstance())
        return this;
      if (other.getScore() != 0F) {
        setScore(other.getScore());
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
      com.google.cloud.automl.v1.ClassificationAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1.ClassificationAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float score_;
    /**
     *
     *
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence that the annotation is positive. If a user
     * approves an annotation as negative or positive, the score value remains
     * unchanged. If a user creates an annotation, the score is 0 for negative or
     * 1 for positive.
     * </pre>
     *
     * <code>float score = 1;</code>
     *
     * @return The score.
     */
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence that the annotation is positive. If a user
     * approves an annotation as negative or positive, the score value remains
     * unchanged. If a user creates an annotation, the score is 0 for negative or
     * 1 for positive.
     * </pre>
     *
     * <code>float score = 1;</code>
     *
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {

      score_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence that the annotation is positive. If a user
     * approves an annotation as negative or positive, the score value remains
     * unchanged. If a user creates an annotation, the score is 0 for negative or
     * 1 for positive.
     * </pre>
     *
     * <code>float score = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScore() {

      score_ = 0F;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.ClassificationAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.ClassificationAnnotation)
  private static final com.google.cloud.automl.v1.ClassificationAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.ClassificationAnnotation();
  }

  public static com.google.cloud.automl.v1.ClassificationAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClassificationAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<ClassificationAnnotation>() {
        @java.lang.Override
        public ClassificationAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ClassificationAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ClassificationAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClassificationAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.ClassificationAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}