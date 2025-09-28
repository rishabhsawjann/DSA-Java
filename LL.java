class LL
{
    
    private class Node{
        private int value;
        private Node next;

        public Node(int value){// this is a construtor for the Node class
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}