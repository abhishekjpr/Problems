#include<iostream>
using namespace std;

struct Node{
	int data;
	Node* next;
};

Node* root = NULL;

void display();
void insert(int n);
void deleteNodes(int m, int n);

Node* getNewNode(){
	return new Node();
}

int main(void){
	int num, n, m;
	cout<<"\nEnter number :: ";
	cin>>num;
	insert(num);
	display();
	cout<<"\nEnter M :: ";
	cin>>m;
	cout<<"\nEnter N :: ";
	cin>>n;
	cout<<"\nYou want to delete "<<m<<" nodes after every "<<n<<" nodes ..!!";
	deleteNodes(m, n);
	cout<<"\nList is :: "<<endl;
	display();
}


void insert(int num){
	Node* temp = NULL;
	for(int i = 0; i < num; i++){
		Node* newNode = getNewNode();
		cout<<"\nEnter node data :: ";
		cin>>newNode->data;
		if(root == NULL){
			root = temp = newNode;
		}
		else{
			temp->next = newNode;
			temp = newNode;
		}
	}
}

void deleteNodes(int m, int n){
	int mCount , nCount = 0;
	mCount = 1;
	nCount = 1;
	Node *temp = root;
	Node *sTemp = NULL;
	while(temp!=NULL){
		if(nCount==n){
			sTemp = temp->next;
			while(mCount!=m && sTemp!=NULL){
					mCount++;
					sTemp = sTemp->next;
			}
			if(sTemp==NULL){	
				temp->next = NULL;	
			}
			else{
				temp->next = sTemp->next;
				sTemp->next = NULL;
			}
			mCount = 1;
			nCount = 0;
		}
		nCount++;
		temp = temp->next;
	}
}

void display(){
	Node* temp = root;
	while(temp->next!=NULL){
		cout<<temp->data<<" -> ";
		temp = temp->next;
	}
	cout<<temp->data;
}
