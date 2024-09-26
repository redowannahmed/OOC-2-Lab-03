#include <iostream>
#include <stack>
using namespace std;

stack <int> s;

class Node
{
private:
    int data;
    Node* next;

public:
    Node (int n)
    {
        this->data = n;
        this->next = nullptr;
    }

    friend class MaxStack;
};

class MaxStack
{
private:
    stack <int> mainStack;
    stack <int> s;

public:
    void push (int item)
    {
        mainStack.push (item);

        if (s.empty() || item >= s.top())
            s.push (item);
    }

    void pop ()
    {
        if (mainStack.empty ())
            return;
        
        if (mainStack.top() == s.top() )
            s.pop();
        
        mainStack.pop ();
    }

    int max () const 
    {
        if (s.empty())
            throw out_of_range("stack empty");
        
        return s.top ();
    }

    int top () const{
        if (mainStack.empty())
            throw out_of_range("empty");
        
        return mainStack.top ();
    }

    bool empty () const 
    {
        return mainStack.empty();
    }
};

int main ()
{
    MaxStack stack;
    stack.push (10);
    stack.push (20);
    stack.push (15);

    cout << "current max: " << stack.max () << endl;

    stack.push (30);
    cout << "current max: " << stack.max () << endl;

    stack.pop ();

    cout << "current max: " << stack.max () << endl;
    
    return 0;
}