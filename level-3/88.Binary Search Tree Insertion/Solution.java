public static Node insert(Node root,int data) {
        
    if(root == null){
        return new Node(data);
    }
    
    if(root.data > data){
        //left
        root.left = insert(root.left,data);
    }else if(root.data < data){
        //right
        root.right = insert(root.right,data);
    }
    
    return root;
}