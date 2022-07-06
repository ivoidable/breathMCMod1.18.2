package invoidable.breath.Item.Custom;

import invoidable.breath.Item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.common.ForgeTier;

public class NichirinSwordItem extends SwordItem {

    public NichirinSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {

        ItemStack hand = pAttacker.getMainHandItem();

        if (hand.is(ModItems.THUNDER_NICHIRIN_SWORD.get())) {

            ServerLevel world = pAttacker.getServer().overworld();
            pAttacker.addEffect(new MobEffectInstance(MobEffects.HEAL, 20, 5));
            EntityType.LIGHTNING_BOLT.spawn(world, null, null, pTarget.blockPosition(), MobSpawnType.TRIGGERED, true, true);

        } else if (hand.is(ModItems.ICE_NICHIRIN_SWORD.get())) {

            pTarget.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200, 5));
            pTarget.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 5));
            pTarget.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 200, 5));
            pTarget.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 5));

        } else if (hand.is(ModItems.AIR_NICHIRIN_SWORD.get())) {

            pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100, 10));

        } else if (hand.is(ModItems.FLAME_NICHIRIN_SWORD.get())) {

            pTarget.setSecondsOnFire(10);

        }
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        ItemStack hand = pPlayer.getMainHandItem();
        ServerLevel world = pPlayer.getServer().overworld();

        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        BlockHitResult blockhitresult = getPlayerPOVHitResult(pLevel, pPlayer, ClipContext.Fluid.NONE);
        InteractionResultHolder<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(pPlayer, pLevel, itemstack, blockhitresult);

        if (hand.is(ModItems.THUNDER_NICHIRIN_SWORD.get())) {
            if (blockhitresult.getType() == HitResult.Type.MISS) {
                return super.use(pLevel, pPlayer, pUsedHand);
            } else if (blockhitresult.getType() == HitResult.Type.ENTITY) {



            } else {
                return super.use(pLevel, pPlayer, pUsedHand);
            }

        } else if (hand.is(ModItems.ICE_NICHIRIN_SWORD.get())) {



        } else if (hand.is(ModItems.AIR_NICHIRIN_SWORD.get())) {



        } else if (hand.is(ModItems.FLAME_NICHIRIN_SWORD.get())) {



        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
