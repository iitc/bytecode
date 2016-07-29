package com.iancaffey.bytecode.io.attribute;

import com.iancaffey.bytecode.io.AttributeVisitor;
import com.iancaffey.bytecode.io.ClassReader;
import com.iancaffey.bytecode.util.AttributeHandler;

import java.io.IOException;

/**
 * LocalVariableTableHandler
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class LocalVariableTableHandler implements AttributeHandler {
    @Override
    public void accept(ClassReader reader, AttributeVisitor visitor, int length) throws IOException {
        int count = reader.readUnsignedShort();
        LocalVariableVisitor localVariableVisitor = visitor.visitLocalVariableTable(count);
        localVariableVisitor.begin();
        for (int i = 0; i < count; i++)
            localVariableVisitor.visit(reader.readUnsignedShort(), reader.readUnsignedShort(), reader.readUnsignedShort(), reader.readUnsignedShort(), reader.readUnsignedShort());
        localVariableVisitor.end();
    }
}
