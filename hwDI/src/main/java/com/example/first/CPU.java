package com.example.first;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class CPU {
	private String name;
	private int core;
	private int thread;
	private int geekBenchSingle;
	private int geekBenchMulti;
	public CPU() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCore() {
		return core;
	}
	public void setCore(int core) {
		this.core = core;
	}
	public int getThread() {
		return thread;
	}
	public void setThread(int thread) {
		this.thread = thread;
	}
	public int getGeekBenchSingle() {
		return geekBenchSingle;
	}
	public void setGeekBenchSingle(int geekBenchSingle) {
		this.geekBenchSingle = geekBenchSingle;
	}
	public int getGeekBenchMulti() {
		return geekBenchMulti;
	}
	public void setGeekBenchMulti(int geekBenchMulti) {
		this.geekBenchMulti = geekBenchMulti;
	}
	public void display() {
		System.out.println("CPU [name=" + name + ", core=" + core + ", thread=" + thread + ", geekBenchSingle=" + geekBenchSingle
				+ ", geekBenchMulti=" + geekBenchMulti + "]");
	}
}
