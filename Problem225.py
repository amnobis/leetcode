class Problem225:
    # initialize your data structure here.
    def __init__(self):
        self.stack = []

    # @param x, an integer
    # @return nothing
    def push(self, x):
        self.stack.append(x)

    # @return nothing
    def pop(self):
        self.stack.pop()

    # @return an integer
    def top(self):
        return self.stack[-1]

    # @return an boolean
    def empty(self):
        return not self.stack
    
