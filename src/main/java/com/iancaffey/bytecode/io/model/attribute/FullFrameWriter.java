package com.iancaffey.bytecode.io.model.attribute;

import com.iancaffey.bytecode.io.BytecodeWriter;

import java.io.IOException;

/**
 * FullFrameWriter
 *
 * @author Ian Caffey
 * @since 1.0
 */
public class FullFrameWriter extends BytecodeWriter implements FullFrameVisitor {
    @Override
    public VerificationTypeVisitor visitLocals(int count) throws IOException {
        return null;
    }

    @Override
    public VerificationTypeVisitor visitStack(int count) throws IOException {
        return null;
    }
}
