# DesignPatterns

## 适配器模式(Adapter Pattern)
 定义：将一个类的接口转成客户期望的另外一个接口。适配器模式使得原本由于接口不匹配而不能一起工作的那些类可以一起工作。  
 示例：本示例(com.kv.adapter)通过使用适配器将laptop的typeC数据传输接口转换为HDMI接口，供monitor使用。
## 适配器模式(Adapter Pattern)
 定义：定义一系列算法，将每个算法封装到具有公共接口的一系列策略类中，从而使它们可以相互替换，让算法可在不影响客户端的情况下发生变化
 示例：本示例(com.kv.strategy)通过定义一系列促销活动，应对不同节假日促销。
## 代理模式(Proxy Pattern)
 定义：为其他对象提供一种代理，以控制对这个对象的访问。代理对象起到中介作用，可去掉功能或者增加额外功能。  
 示例：本示例(com.kv.proxy)Boss可以通过代理，让不同司机代驾。(包括静态代理和动态代理)
## 责任链模式(Chain Of Responsibility)
 定义：使多个对象有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一个链，并沿着这条链传递请求，直到有对象处理它为止
 示例：本示例(com.kv.chainofresponsibility)雇员的请假流程，根据请假天数，分别传递到相应的批假人手中。