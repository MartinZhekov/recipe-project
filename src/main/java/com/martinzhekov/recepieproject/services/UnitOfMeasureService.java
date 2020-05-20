package com.martinzhekov.recepieproject.services;

import com.martinzhekov.recepieproject.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by martinzhekov on 20.05.20
 */


public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
