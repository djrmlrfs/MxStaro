package cn.littleround.ASTnode;

public class ClassDefinitionNode extends DeclarationNode {
    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}