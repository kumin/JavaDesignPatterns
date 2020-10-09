package com.kumin.creational.builder;

public class RobotFace {
    private String hairColor;
    private String hairType;
    private String eyeColor;
    private String eyeSize;

    private RobotFace(String hairColor, String hairType, String eyeColor, String eyeSize) {
        this.hairColor = hairColor;
        this.hairType = hairType;
        this.eyeColor = eyeColor;
        this.eyeSize = eyeSize;
    }

    @Override
    public String toString() {
        return "RobotFace{" +
                "hairColor='" + hairColor + '\'' +
                ", hairType='" + hairType + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", eyeSize='" + eyeSize + '\'' +
                '}';
    }

    public static class RobotFaceBuilder {
        private String hairColor;
        private String hairType;
        private String eyeColor;
        private String eyeSize;

        public RobotFaceBuilder setHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public RobotFaceBuilder setHairType(String hairType) {
            this.hairType = hairType;
            return this;
        }

        public RobotFaceBuilder setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public RobotFaceBuilder setEyeSize(String eyeSize) {
            this.eyeSize = eyeSize;
            return this;
        }

        public RobotFace build() {
            return new RobotFace(hairColor, hairType, eyeColor, eyeSize);
        }
    }
}
