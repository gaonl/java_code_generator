package com.magicli.type;

import java.util.List;

/**
 * Created by gaonl on 2018/2/9.
 */
public interface JavaClassTypeDescriptor extends JavaTypeDescriptor {
    public String getPackageName();

    public String getAccessFlag();

    public String getType();

    public List<JavaFieldDescriptor> getFields();

    public List<JavaMethodDescriptor> getMethods();
}
