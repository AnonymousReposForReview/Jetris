package tests.javafuzzer2293;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 11:35:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2519262581L;
    public static int iFld=4;
    public static byte byFld=-124;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, boolean b) {

        int i4=-8, i5=0, i6=246, i7=187, i8=-9, iArr[]=new int[N];
        float f=-53.256F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -60);
        FuzzerUtils.init(lArr, -37981L);

        for (i4 = 6; 348 > i4; ++i4) {
            i6 = 1;
            while (++i6 < 5) {
                switch ((i4 % 2) + 2) {
                case 2:
                    i5 -= i4;
                    Test.instanceCount = -54754;
                    break;
                case 3:
                    if (b) break;
                default:
                    switch ((i4 % 2) + 117) {
                    case 117:
                        for (i7 = 1; 1 > i7; i7++) {
                            i5 *= i6;
                            i5 += i7;
                            f += (i7 + i5);
                            iArr[i4 - 1] = (int)1426747939L;
                            Test.instanceCount = i4;
                            i8 += (int)(-32.279F + (i7 * i7));
                            i8 = i4;
                        }
                        break;
                    case 118:
                        lArr[i4 + 1] = i7;
                        break;
                    }
                }
            }
        }
        vMeth2_check_sum += i3 + (b ? 1 : 0) + i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1() {

        boolean b1=true;
        short s=-19956;
        int i9=-28, i10=-164, i11=-14, i12=2, i13=4, i14=43107, i15=155, iArr1[]=new int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -15519L);
        FuzzerUtils.init(iArr1, -3);

        vMeth2(Test.iFld, b1);
        Test.iFld -= Test.iFld;
        s = (short)Test.instanceCount;
        lArr1[(Test.iFld >>> 1) % N] = Test.iFld;
        for (i9 = 4; i9 < 385; i9++) {
            for (i11 = 1; 4 > i11; i11++) {
                iArr1[i11] >>= i13;
                for (i14 = 1; i14 < 2; i14++) {
                    i13 &= i14;
                    Test.instanceCount += i14;
                    if (i10 != 0) {
                        vMeth1_check_sum += (b1 ? 1 : 0) + s + i9 + i10 + i11 + i12 + i13 + i14 + i15 +
                            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    if (b1) break;
                    iArr1[i14] -= i10;
                    Test.instanceCount += i15;
                    s *= (short)Test.instanceCount;
                }
            }
        }
        vMeth1_check_sum += (b1 ? 1 : 0) + s + i9 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, int i1) {

        int i2=-12, i16=-78, i17=-27584;
        float f1=65.212F;
        boolean b2=false;
        byte byArr[]=new byte[N];
        long lArr2[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(byArr, (byte)105);
        FuzzerUtils.init(lArr2, 3941645122L);
        FuzzerUtils.init(sArr, (short)25873);

        i2 = 1;
        while (++i2 < 267) {
            i += i2;
            vMeth1();
            Test.instanceCount *= i;
        }
        i16 = 189;
        while ((i16 -= 3) > 0) {
            byArr[i16 + 1] += (byte)f1;
            i1 >>= 38737;
            i1 = i2;
            i *= i2;
            Test.iFld += i16;
            i1 += (((i16 * i1) + i16) - i);
            Test.instanceCount <<= Test.instanceCount;
            if (b2) break;
            lArr2[i16 - 1] = i16;
            sArr[i16] = (short)i17;
        }
        vMeth_check_sum += i + i1 + i2 + i16 + Float.floatToIntBits(f1) + (b2 ? 1 : 0) + i17 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        double d=-86.130539;
        int i18=-2, i19=-33415, i20=166, i21=46833, i22=6, i23=166, i24=85, i25=-4, i26=1, i27=14870, i28=1,
            i29=-37215, iArr2[]=new int[N];
        short s1=958;
        float f2=0.919F;

        FuzzerUtils.init(iArr2, 19255);

        vMeth(-12570, Test.iFld);
        d *= Test.instanceCount;
        iArr2[(Test.iFld >>> 1) % N] %= (int)(Test.iFld | 1);
        i18 = 1;
        while (++i18 < 276) {
            for (i19 = 5; i19 < 91; ++i19) {
                Test.iFld += (i19 + i20);
            }
            Test.iFld = (int)Test.instanceCount;
            iArr2[i18] = i19;
            s1 += (short)Test.iFld;
            for (i21 = 5; i21 < 91; ++i21) {
                d = i18;
            }
        }
        i22 = i21;
        i23 = 1;
        while (++i23 < 272) {
            Test.instanceCount = i18;
        }
        s1 <<= Test.byFld;
        iArr2[(-45060 >>> 1) % N] += (int)f2;
        for (i24 = 295; i24 > 6; i24 -= 3) {
            Test.iFld = (int)d;
            i22 = (int)Test.instanceCount;
            Test.iFld += (i24 * i24);
            for (i26 = i24; i26 < 261; i26++) {
                i28 = 1;
                while (++i28 < 1) {
                    switch ((i26 % 1) + 1) {
                    case 1:
                    default:
                        if (true) continue;
                        i22 += (((i28 * i26) + i28) - f2);
                        f2 *= i21;
                        iArr2[(26976 >>> 1) % N] = i25;
                    }
                }
                i29 = 1;
                do {
                    Test.byFld |= (byte)i22;
                    i25 = Test.byFld;
                } while (++i29 < 1);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
