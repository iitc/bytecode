package com.iancaffey.bytecode.util.debug;

import com.iancaffey.bytecode.model.AttributeModelVisitor;
import com.iancaffey.bytecode.model.attribute.CodeVisitor;
import com.iancaffey.bytecode.model.attribute.ExceptionVisitor;

/**
 * DebugCodeVisitor
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class DebugCodeVisitor extends DebugVisitor implements CodeVisitor {
    public DebugCodeVisitor() {
    }

    public DebugCodeVisitor(int indent) {
        super(indent);
    }

    @Override
    public void visitDepth(int maxStack, int maxLocals) {
        log(String.format("Depth [maxStack=%d, maxLocals=%d]", maxStack, maxLocals), 1);
    }

    @Override
    public void visitData(byte[] data) {
        log(String.format("Code [data=%d]", data.length), 1);
    }

    @Override
    public ExceptionVisitor visitExceptionTable(int count) {
        log(String.format("ExceptionTable [count=%d]", count), 1);
        return new DebugExceptionVisitor(indent() + 1);
    }

    @Override
    public AttributeModelVisitor visitAttributes(int count) {
        log(String.format("Attributes [count=%d]", count), 1);
        return new DebugAttributeModelVisitor(indent() + 1);
    }
}
