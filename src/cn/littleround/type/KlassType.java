package cn.littleround.type;

import cn.littleround.symbol.ClassSymbol;

public class KlassType extends BaseType {
    ClassSymbol cs;
    // example: A x = new A();
    // First A --- UserDefinedType
    // Second A --- KlassType

    public KlassType(ClassSymbol cs) {
        this.cs = cs;
    }
}
