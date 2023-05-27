public static int height(Node root) {
    // Write your code here.
  if(root == null){
      return -1;
  }
  
  int leftH = height(root.left);
  int rightH = height(root.right);
                      
  return Math.max(leftH,rightH) + 1;
}
