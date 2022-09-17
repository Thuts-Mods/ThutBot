package com.example.examplemod.examplemoves.worldactions;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import pokecube.api.entity.pokemob.IPokemob;
import pokecube.api.moves.IMoveAction;
import thut.api.maths.Vector3;

/**
 * This class is used to apply effects in world after a move is used.
 * 
 * @author Thutmose
 *
 */
public class ExampleWorldAction implements IMoveAction
{

    @Override
    public boolean applyEffect(IPokemob pokemob, Vector3 location)
    {
        // We shall place a diamond block here.
        Level level = pokemob.getEntity().getLevel();
        return level.setBlockAndUpdate(location.getPos(), Blocks.DIAMOND_BLOCK.defaultBlockState());
    }

    @Override
    public String getMoveName()
    {
        // This name should match the move we are applying to, in this case, we
        // do for the example move.
        return "example_attack";
    }

}
