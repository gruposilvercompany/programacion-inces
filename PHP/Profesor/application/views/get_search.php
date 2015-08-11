<div class="reslt_get_search">
<?php foreach ($result['result'] as $list) : ?>
    <div><?php print"$list[ac_id]";?></div>
    <div><?php print"$list[ac_email]";?></div>
<?php endforeach; ?>

    <div><?php print"$result[statu]";?></div>
</div>