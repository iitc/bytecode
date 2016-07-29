package com.iancaffey.bytecode.io.constant;

import com.iancaffey.bytecode.io.BytecodeHandler;
import com.iancaffey.bytecode.io.ClassReader;
import com.iancaffey.bytecode.io.ConstantPoolVisitor;

import java.io.IOException;

/**
 * IntegerInfoHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class IntegerInfoHandler implements BytecodeHandler<ClassReader, ConstantPoolVisitor> {
    @Override
    public void accept(ClassReader reader, ConstantPoolVisitor visitor) throws IOException {
        visitor.visitInteger(reader.readInt());
    }
}
