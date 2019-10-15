package com.vcs.lects.l17.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController("")
public class HelloWorldController {



    @Autowired
    private HttpServletRequest request;

    @GetMapping("/img")
    public String sayHello() {
        return "<html><body><h1>Labas pasauli, as REST servisas (" + request.getRemoteHost()
                + ")</h1><p align='center'><img src='http://192.168.115.133:8080/generated-image/"+request.getRemoteHost()+"' alt='Paveiksliukas su tavo IP adresu'></p></body></html>";
    }

    @GetMapping("/myip")
    public String sayHelloHtml() {
        return "<html><body><h1>Labas pasauli, as REST servisas (" + request.getRemoteHost()
                + ")</h1><p align='center'></p></body></html>";
    }


    @GetMapping("/")
    public String syHi() {
        return "Labas, as kebabas :)";
    }


    @GetMapping("/asmuo")
    public Person giveMePersonGET() {
        return new Person("Antanas", 345);
    }

    @PostMapping("/asmuo/{vardas}/{age}")
    public Person giveMePersonPOST(@PathVariable("vardas") String name, @PathVariable("age") Integer age) {
        return new Person(name, age);
    }


    @GetMapping(value = "generated-image/{txt}", produces = {"image/jpeg"})
    public @ResponseBody byte[] getImageAsByteArray(@PathVariable("txt") String txt) throws IOException {

        int width = 250;
        int height = 250;

        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Create a graphics which can be used to draw into the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();

        // fill all the image with white
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, width, height);

        // create a circle with black
        g2d.setColor(Color.black);
        g2d.fillOval(0, 0, width, height);

        // create a string with yellow
        g2d.setColor(Color.yellow);
        g2d.drawString("TEXT: " + txt, 50, 120);

        // Disposes of this graphics context and releases any system resources that it is using.
        //g2d.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write( bufferedImage, "jpg", baos );
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();

        return imageInByte;
    }



}
