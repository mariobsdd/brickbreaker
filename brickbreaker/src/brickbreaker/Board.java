/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.lang.Thread;
import javax.sound.sampled.*;
import java.io.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.TreeMap;
import java.awt.Toolkit.*;


/**
 *
 * @author mario
 */
public class Board extends JPanel implements Runnable, Constants {
    //Items on-screen
	private Paddle paddle;
	private Ball ball;
	private Brick[][] brick = new Brick[10][5];

	//Initial Values for some important variables
	private int score = 0, lives = MAX_LIVES, bricksLeft = MAX_BRICKS, waitTime = 3, xSpeed, withSound, level = 1;

	//Player's name
	private String playerName;

	//The game
	private Thread game;
}
