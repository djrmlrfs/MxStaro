package cn.littleround.ASTnode;

public class PostfixAddNode extends IntUnaryOpNode {
    @Override
    public void checkType() {
        super.checkType();
        if (!isLvalue(op1())) {
            reportError("Semantic", "++ to a r-value is illegal.");
        }
    }
}
