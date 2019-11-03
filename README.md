# generics-examples
Examples and code listings for generics presentation

```
Classfile /C:/Users/└ЁЄєЁ/playground/java/generics/GClass.class
  Last modified 03.11.2019; size 452 bytes
  MD5 checksum 8e5a0b7badc4347278028fead19aa71a
  Compiled from "GClass.java"
public class GClass<T extends java.lang.Object> extends java.lang.Object
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #4.#17         // java/lang/Object."<init>":()V
   #2 = String             #18            // String
   #3 = Class              #19            // GClass
   #4 = Class              #20            // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Utf8               Code
   #8 = Utf8               LineNumberTable
   #9 = Utf8               getFoo
  #10 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #11 = Utf8               Signature
  #12 = Utf8               (TT;)TT;
  #13 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #14 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;
  #15 = Utf8               SourceFile
  #16 = Utf8               GClass.java
  #17 = NameAndType        #5:#6          // "<init>":()V
  #18 = Utf8               String
  #19 = Utf8               GClass
  #20 = Utf8               java/lang/Object
{
  public GClass();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 1: 0

  public T getFoo(T);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: areturn
      LineNumberTable:
        line 3: 0
    Signature: #12                          // (TT;)TT;

  public java.lang.String getFoo(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: ldc           #2                  // String String
         2: areturn
      LineNumberTable:
        line 7: 0
}
Signature: #14                          // <T:Ljava/lang/Object;>Ljava/lang/Object;
SourceFile: "GClass.java"
```
