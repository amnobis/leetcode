class Problem232:
    # initialize your data structure here.
    def __init__(self):
        self.queue = []

    # @param x, an integer
    # @return nothing
    def push(self, x):
        self.queue.append(x)

    # @return nothing
    def pop(self):
        del self.queue[0]

    # @return an integer
    def peek(self):
        return self.queue[0]

    # @return an boolean
    def empty(self):
        return not self.queue