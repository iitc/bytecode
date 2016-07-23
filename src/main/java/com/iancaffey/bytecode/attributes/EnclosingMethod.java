package com.iancaffey.bytecode.attributes;

import com.iancaffey.bytecode.AttributeInfo;

/**
 * EnclosingMethod
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class EnclosingMethod extends AttributeInfo {
    private final int classIndex;
    private final int methodIndex;

    public EnclosingMethod(int nameIndex, int infoLength, int classIndex, int methodIndex) {
        super(nameIndex, infoLength);
        this.classIndex = classIndex;
        this.methodIndex = methodIndex;
    }

    public int classIndex() {
        return classIndex;
    }

    public int methodIndex() {
        return methodIndex;
    }
}
