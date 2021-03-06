package cn.littleround.ASTnode;

import cn.littleround.Constants;
import cn.littleround.type.PointerType;

public class ConstantNode extends ExpressionNode {
    private int constant;
    private boolean isBool = false;
    private boolean isNull = false;

    public int getConstant() {
        return constant;
    }

    public void setConstant(int constant) {
        this.constant = constant;
    }

    public ConstantNode(int constant) {
        this.constant = constant;
    }

    public ConstantNode(boolean constant) {
        this.isBool = true;
        this.constant = constant ? 1 : 0;
    }

    public ConstantNode() {
        this.isNull = true;
    }

    public boolean isBool() {
        return isBool;
    }

    public void setBool(boolean bool) {
        isBool = bool;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ConstantNode)) return false;
        ConstantNode rhs = (ConstantNode) obj;
        return this.isNull == rhs.isNull && this.isBool == rhs.isBool && this.constant == rhs.constant;
    }

    @Override
    public void updateType() {
        super.updateType();
        if (isNull) type = Constants.NULL; else
            if (isBool) type = Constants.BOOL; else type = Constants.INT;
    }
}
