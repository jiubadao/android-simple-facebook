package com.sromku.simple.fb.listeners;

import java.util.List;

import com.sromku.simple.fb.entities.Group;

/**
 * Callback listener for getting groups that person belongs to
 */
public interface OnGroupsListener extends OnActionListener<List<Group>> {
}
