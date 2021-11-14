import static org.junit.Assert.*;

import org.junit.Test;

import com.bitblaster.texture.TextureMap;

public class LoadTexturesTest {

	@Test
	public void test() {
		assertFalse(TextureMap.getInstance().getTextureMap().isEmpty());
	}

}
