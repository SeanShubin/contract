### Contract
Hide difficult to test java libraries behind an interface

### Notes
- Be careful when testing arrays, you will have to convert them to sequences in your assertions to enable value-like comparison.  Otherwise, you will get Java's default reference equality.
- This project is in two modules
    - "domain" contains the actual implementations and the interfaces that are hiding them.
    - "test" contains implementations that throw exceptions if invoked.  It should only be included in test scope.  This prevents the *NotImplemented classes from being deployed with your production code. 
- For testing, you should inherit from one of the *NotImplemented implementations, and only override what you need.  That way, if later versions of java add new methods, only those methods have to be added to their corresponding *NotImplemented classes, and these new methods will be automatically inherited by your test implementations.  
