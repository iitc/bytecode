package com.iancaffey.bytecode.io.constant;

import com.iancaffey.bytecode.io.BytecodeHandler;
import com.iancaffey.bytecode.io.ClassReader;
import com.iancaffey.bytecode.io.ConstantPoolVisitor;

import java.io.IOException;

/**
 * FieldReferenceInfoHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class FieldReferenceInfoHandler implements BytecodeHandler<ClassReader, ConstantPoolVisitor> {
    @Override
    public void accept(ClassReader reader, ConstantPoolVisitor visitor) throws IOException {
        visitor.visitFieldReference(reader.readUnsignedShort(), reader.readUnsignedShort());
    }
}