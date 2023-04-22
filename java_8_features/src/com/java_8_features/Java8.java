package com.java_8_features;

@FunctionalInterface
interface Numeric
{
	//single abstract method
	public abstract  void show();
}
@FunctionalInterface
interface Add
{
	public abstract float add(float x, float y);
}

@FunctionalInterface
interface Nickname
{
	public abstract String setNickname(String nickName);
}
