package tests.javafuzzer3340;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 06:22:19 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=46131L;
    public static double dFld=0.67557;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -8202);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=23320, i5=2, i6=-7, i7=-4, i8=-100, i9=-28, i10=9, i11=-44672, i12=-3496, i13=11388, iArr[]=new int[N];
        byte by=77;
        boolean b=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -192);
        FuzzerUtils.init(fArr, 2.969F);

        i4 = i4;
        if (b) {
            iArr[(5 >>> 1) % N] = i4;
            for (i5 = 6; i5 < 125; i5++) {
                for (i7 = 1; 13 > i7; i7++) {
                    Test.iArrFld[i7] = i7;
                    Test.iArrFld[i5] *= (int)Test.instanceCount;
                    i6 += i9;
                    i6 += i6;
                }
                switch (((i5 % 3) * 5) + 44) {
                case 54:
                    for (i10 = 13; i10 > i5; i10 -= 2) {
                        for (i12 = 1; i12 < 1; i12 += 3) {
                            fArr[i5 - 1] = i4;
                            i13 = -215;
                            Test.instanceCount = i8;
                        }
                    }
                case 49:
                case 56:
                    i13 += (((i5 * Test.instanceCount) + i4) - i7);
                default:
                    by >>= (byte)i10;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + by + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2, float f, int i3) {

        int i14=-28149, i15=-34165, i16=-37, i17=-33851, i18=-146;
        byte byArr[]=new byte[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(byArr, (byte)-100);
        FuzzerUtils.init(sArr, (short)-20919);

        Test.iArrFld[(i3 >>> 1) % N] >>= (int)(byArr[(i3 >>> 1) % N] >>= (byte)(i3 = (int)(f - i3)));
        f = (i2 = Test.iArrFld[(i2 >>> 1) % N]);
        vMeth1();
        Test.instanceCount = i3;
        for (i14 = 16; i14 < 361; i14++) {
            Test.iArrFld[i14] = (int)Test.instanceCount;
            Test.instanceCount <<= Test.instanceCount;
            i3 *= 9;
            if (false) break;
            i16 = 1;
            while (++i16 < 5) {
                for (i17 = i14; 1 > i17; ++i17) {
                    Test.dFld += i17;
                    Test.instanceCount = i15;
                    sArr[i16] += (short)i17;
                    i2 += (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + i3 + i14 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(sArr);
    }

    public static void vSmallMeth(long l, int i1) {

        float f1=83.89F;

        vMeth(i1, f1, i1);
        Test.iArrFld = Test.iArrFld;
        vSmallMeth_check_sum += l + i1 + Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        int i=-14, i19=-4, i20=-45029, i21=4, i22=-234, i23=38467;
        boolean b1=false, bArr[]=new boolean[N];
        byte by1=72;
        long l1=-2024253810L;

        FuzzerUtils.init(bArr, true);

        i += -54395;
        Test.dFld /= (((i--) * (--Test.instanceCount)) | 1);
        for (int smallinvoc=0; smallinvoc<811; smallinvoc++) vSmallMeth(Test.instanceCount, i);
        for (i19 = 7; i19 < 369; ++i19) {
            Test.dFld = i;
            i21 = 70;
            while (--i21 > 0) {
                i += (i21 * i21);
                i20 += (int)4L;
                i -= -3255;
                i -= i21;
                if (b1) break;
                i20 = (int)Test.instanceCount;
                Test.instanceCount += (i21 * i21);
                i20 -= i19;
            }
            switch ((i19 % 3) + 18) {
            case 18:
                i20 *= -33944;
                i20 = i19;
                b1 = b1;
            case 19:
                for (i22 = 1; i22 < 70; ++i22) {
                    short s=-504;
                    switch (((i19 % 2) * 5) + 111) {
                    case 116:
                        switch (((i >>> 1) % 1) + 51) {
                        case 51:
                            by1 >>= (byte)Test.instanceCount;
                            bArr[i19 - 1] = b1;
                            i += (i22 | i);
                            i20 += i22;
                            break;
                        }
                        if (false) {
                            i20 = i21;
                            i >>>= i21;
                            l1 += (((i22 * i21) + i19) - s);
                            i += s;
                        } else {
                            i &= i19;
                        }
                        break;
                    case 117:
                        i = (int)Test.instanceCount;
                        break;
                    }
                }
                break;
            case 20:
                i20 = i;
                break;
            default:
                i20 >>= 105;
            }
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
