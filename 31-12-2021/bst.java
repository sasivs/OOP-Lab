class node{
	int data;
	node left,right;
    node(int key){
        data=key;
        left=right=null;
    }
}	
class tree{
	node root=null;
    node insert(node root,int key){
		if(root==null){
			node nNode=new node(key);
			return nNode;
		}
		if(root.data>key){
			root.left=insert(root.left,key);
		}
		else if(root.data<key){
			root.right=insert(root.right,key);
		}
		return root;
	}	

    node search(node root, int key){
        if(root==null || root.data==key){return root;}
        else if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }

    node delete(node root, int key){
        if(root==null){return root;}
        if(root.data > key){
            root.left = delete(root.left,key);
        }
        else if (root.data < key){
            root.right = delete(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            node iter=root.right;
            while(iter.left!=null){
                iter=iter.left;
            }
            root.data=iter.data;
            return delete(root,iter.data);
        }
        return root;
    }

    int height(node root){
        if(root==null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        if(l>r){
            return l+1;
        }
        return r+1;
    }

	void inorder(node root){
		if (root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+"->");
		inorder(root.right);
	}

    void preorder(node root){
		if (root==null){
			return;
		}
        System.out.print(root.data+"->");
		preorder(root.left);
		preorder(root.right);
	}

    void postorder(node root){
		if (root==null){
			return;
		}
		postorder(root.left);
		postorder(root.right);
        System.out.print(root.data+"->");
    }
}

public class bst{
	public static void main (String args[]){
		tree t1=new tree();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arr.length; i++){
            t1.root=t1.insert(t1.root, arr[i]);
        }
		t1.inorder(t1.root);
        System.out.println();
        t1.preorder(t1.root);
        System.out.println();
        t1.postorder(t1.root);
		System.out.println();
        System.out.println(t1.height(t1.root));
        System.out.println(t1.search(t1.root,5).data);
        t1.root=t1.delete(t1.root, 1);
        t1.inorder(t1.root);
		System.out.println();
	}
}