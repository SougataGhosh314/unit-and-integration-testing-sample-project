package com.sougata.unitandintegrationtestingsampleproject.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootControllerTest {

    @Test
    void hello() {
        RootController controller = new RootController(); // Arrange
        String response = controller.hello("World"); // Act
        assertEquals("Hello, World", response);// Assert
    }
}