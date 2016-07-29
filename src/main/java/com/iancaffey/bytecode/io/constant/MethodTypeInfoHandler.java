package com.iancaffey.bytecode.io.constant;

import com.iancaffey.bytecode.io.BytecodeHandler;
import com.iancaffey.bytecode.io.ClassReader;
import com.iancaffey.bytecode.io.ConstantPoolVisitor;

import java.io.IOException;

/**
 * MethodTypeInfoHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class MethodTypeInfoHandler implements BytecodeHandler<ClassReader, ConstantPoolVisitor> {
    @Override
    public void accept(ClassReader reader, ConstantPoolVisitor visitor) throws IOException {
        visitor.visitMethodType(reader.readUnsignedShort());
    }
}