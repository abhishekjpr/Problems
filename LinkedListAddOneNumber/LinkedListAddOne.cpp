#include<iostream>
using namespace std;

struct Node{
	int data;
	Node* next;
};

Node* root = NULL;

void display();
void insert(int n);
void addOne();
void reverse();

Node* getNewNode(){
	return new Node();
}

int main(void){
	int num;
	cout<<"\nEnter number :: ";
	cin>>num;
	insert(num);
	reverse();
	display();
	reverse();
	addOne();
	cout<<"\nAfter adding 1 to list :: \n";
	reverse();
	display();
}


void insert(int num){
	Node* temp = NULL;
	while(num!=0){
		Node* newNode = getNewNode();
		newNode->data = num%10;
		if(root == NULL){
			root = temp = newNode;
		}
		else{
			temp->next = newNode;
			temp = newNode;
		}
		num/=10;
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

void reverse(){
	Node *temp = root;
	Node *curr, *prev;
	curr = prev = NULL;
	while(temp!=NULL){
		curr = temp;
		temp = temp->next;
		curr->next = prev;
		prev = curr;
	}
	root = curr;
}

void addOne(){
	Node* temp = root;
	Node* prev=temp;
	int carry = 0;
	while(temp!=NULL){
		carry = ((temp->data+1)>=10)?1:0;
		if(carry==1)
			temp->data = 0;
		else{
			temp->data++;
			break;
		}
		prev = temp;
		temp = temp->next;
	}
	if(carry == 1 && temp == NULL){
		Node* newNode = getNewNode();
		newNode->data = 1;
		prev->next = newNode;
	}
}
