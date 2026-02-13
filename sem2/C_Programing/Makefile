# Makefile - place in C_Programing folder
CC = gcc
CFLAGS = -Wall -Wextra -g

SRCS := $(wildcard *.c)
EXES := $(SRCS:.c=.exe)

.PHONY: all clean

all: $(EXES)

# pattern rule: compile foo.c -> foo.exe
%.exe: %.c
	$(CC) $(CFLAGS) $< -o $@

# build a specific program: make day1.exe or make day1
# convenience: allow 'make day1' to build day1.exe
%: %.exe

clean:
	del /Q *.exe 2>nul || rm -f *.exe