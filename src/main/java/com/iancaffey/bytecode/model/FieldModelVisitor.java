package com.iancaffey.bytecode.model;

import com.iancaffey.bytecode.io.BytecodeVisitor;

import java.io.IOException;

/**
 * FieldModelVisitor
 *
 * @author Ian Caffey
 * @since 1.0
 */
public interface FieldModelVisitor extends BytecodeVisitor {
    public void visit(int access, int nameIndex, int descriptorIndex) throws IOException;

    public AttributeModelVisitor visitAttributes(int count) throws IOException;
}
