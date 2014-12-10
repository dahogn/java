package cn.sdu.edu.sc.java.chapt12.basic;


public class ListNode
{
    private String data;
    private ListNode link;


    public ListNode( )
    {
        link = null;
        data = null;
    }

    public ListNode(String newData, ListNode linkValue)
    {
        data = newData;
        link = linkValue;
    }

    public void setData(String newData)
    {
        data = newData;
    }

    public String getData( )
    {
        return data;
    }

    public void setLink(ListNode newLink)
    {
        link = newLink;
    }

    public ListNode getLink( )
    {
        return link;
    }

}
