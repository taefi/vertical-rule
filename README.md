# Vr - Vertical Rule for Vaadin

Vr is a vertical counterpart for Hr component in Vaadin applications. 
The lack of an official component to be used as a vertical separator feels like a paper-cut in every project.
While being extremely minimalistic, this component offers:

- Same color and thickness as Hr component within the Lumo theme.
- The Builder API to customize the color, thickness, and also defining the element id (mostly suited for testing purposes).
- Automatic expansion in the vertical direction within the parent layout.

### Local Deployment of the demo:

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

### Integration test

To run Integration Tests, execute `mvn verify -Pit,production`.
