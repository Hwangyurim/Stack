interface StackInterface<Element>{
    val count:Int
        get
    fun peek():Element?
    val isEmpty:Boolean
        get()=count==0

    fun pop():Element?
    fun push(element:Element)
}
class Stack<Element>:StackInterface<Element>{
    val storage=arrayListOf<Element>()
    override fun toString():String=buildString{
        appendLine("------top-------")
        storage.asReversed().forEach{
            appendLine("$it")
        }
        appendLine("----------------")
    }
    override fun peek():Element?{
        return storage.lastOrNull()
    }
    override val count:Int
        get()=storage.size

    override fun push(element:Element){
        storage.add(element)
    }

    override fun pop():Element?{
        if(storage.size==null){
            return null
        }
        return storage.removeAt(count -1)
    }

}