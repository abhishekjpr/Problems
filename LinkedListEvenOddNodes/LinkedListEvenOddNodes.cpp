#include<iostream>
using namespace std;

struct Node{
	int data;
	Node* next;
};

Node* root = NULL;

void display();
void insert(int n);
void newListEvenOdd();

Node* getNewNode(){
	return new Node();
}

int main(void){
	int num;
	cout<<"\nEnter number :: ";
	cin>>num;
	insert(num);
	display();
	newListEvenOdd();
	cout<<"\nNew list is :: "<<endl;
	display();
}


void newListEvenOdd(){
	if(root == NULL)
		return;
	else if(root->next == NULL)
		return;
	else if(root->next->next == NULL)
		return;
	Node *odd, *even, *evenFirst;
	odd = root;
	even = odd->next;
	evenFirst = even;
	while(evenFirst->next!=NULL){
		odd->next = evenFirst->next;
		odd = odd->next;
		if(odd->next!=NULL){
			evenFirst->next = odd->next;
			evenFirst = evenFirst->next;
		}
		else{
			break;
		}
	}
	if(evenFirst->next != NULL && evenFirst->next->next == NULL){
		evenFirst->next = NULL;
	}
	if(odd->next == NULL){
		odd->next = even;
	}
	else if(evenFirst->next == NULL){
		odd->next = even;
	}
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

void display(){
	if(root==NULL){
		cout<<"\n0List is empty..";
		return;
	}
	Node* temp = root;
	while(temp->next!=NULL){
		cout<<temp->data<<" -> ";
		temp = temp->next;
	}
	cout<<temp->data;
}

