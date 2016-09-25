package com.iancaffey.bytecode.io.model.attribute;

import com.iancaffey.bytecode.io.BytecodeReader;
import com.iancaffey.bytecode.io.model.AttributeModelVisitor;
import com.iancaffey.bytecode.io.model.ClassModelVisitor;

import java.io.IOException;

/**
 * EnclosingMethodHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class EnclosingMethodHandler {
    public static void accept(BytecodeReader<ClassModelVisitor> reader, AttributeModelVisitor visitor, int nameIndex, int length) throws IOException {
        visitor.visitEnclosingMethod(nameIndex, length, reader.readUnsignedShort(), reader.readUnsignedShort());
    }
}
