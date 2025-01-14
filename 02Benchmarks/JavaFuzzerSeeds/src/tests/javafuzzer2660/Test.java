package tests.javafuzzer2660;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 18:11:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static short sFld=-489;
    public static float fFld=2.208F;
    public volatile byte byFld=126;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, long l, int i5) {

        int i6=8, i7=-14103, i8=-3, i9=-1813, iArr[]=new int[N];
        boolean b=false;
        float f=-94.16F;
        byte by1=108;
        long l1=-8L;

        FuzzerUtils.init(iArr, 2);

        i6 = 1;
        while (++i6 < 230) {
            if (b) continue;
            f -= i5;
            by1 = (byte)i6;
            Test.sFld *= (short)i4;
            for (i7 = i6; i7 < 7; i7++) {
                iArr[i6 + 1] += i4;
                i4 *= i7;
                i5 = (int)-44925L;
                for (l1 = 1; l1 < 1; l1++) {
                    iArr = iArr;
                    iArr[i6] = i4;
                    i5 += (int)(l1 * l1);
                    i8 += (int)(l1 | l1);
                    Test.instanceCount = l;
                }
            }
        }
        vMeth2_check_sum += i4 + l + i5 + i6 + (b ? 1 : 0) + Float.floatToIntBits(f) + by1 + i7 + i8 + l1 + i9 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i1) {

        int i2=60512, i3=236, i10=105, i11=-11, i12=6, i13=100;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3079L);

        for (i2 = 18; i2 < 380; i2++) {
            vMeth2(i3, Test.instanceCount, 40094);
            i3 -= (int)-6175255113298533841L;
            for (i10 = 1; i10 < 5; i10 += 3) {
                lArr[i2] = -10;
                i11 = -169;
                for (i12 = 1; i12 < 5; i12++) {
                    i1 = 10;
                    Test.instanceCount = i3;
                    i3 = (int)Test.fFld;
                    i1 += (((i12 * i10) + i12) - i3);
                    i11 += (int)(46.717F + (i12 * i12));
                    i3 += i2;
                    Test.instanceCount += (long)Test.fFld;
                    Test.instanceCount += -182;
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + i3 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i) {

        byte by=-66;
        int i14=56146, i15=14044, i16=65, i17=99, i18=-185, iArr1[]=new int[N];
        double d=93.29041;
        float f1=0.495F;
        boolean b1=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 175);
        FuzzerUtils.init(lArr1, -131L);

        Test.instanceCount = (((i++) << (i - -11)) + ((-6 - Test.instanceCount) - (Test.instanceCount * by)));
        vMeth1(i);
        for (i14 = 251; i14 > 6; --i14) {
            for (i16 = 1; i16 < 7; i16++) {
                i15 -= (int)d;
                switch (((i >>> 1) % 2) + 119) {
                case 119:
                    for (f1 = 1; f1 < 2; f1++) {
                        Test.instanceCount += i16;
                        b1 = b1;
                        iArr1[i16 + 1] = i17;
                        i18 &= (int)Test.instanceCount;
                        i18 = i;
                        lArr1[i14 + 1] = i15;
                        i17 -= i18;
                    }
                case 120:
                    Test.instanceCount += by;
                    break;
                default:
                    i18 += (i16 * i16);
                }
            }
        }
        vMeth_check_sum += i + by + i14 + i15 + i16 + i17 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i18
            + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i19=107, i20=6503, i21=23884, i22=716, i23=122, i24=63043, i25=7, i26=-222;
        double d2=-29.59699;
        boolean b2=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.754F);

        vMeth(i19);
        i20 = 1;
        while ((i20 += 2) < 133) {
            i19 += (int)Test.instanceCount;
            for (i21 = 18; 379 > i21; ++i21) {
                double d1=-46.57136;
                Test.fFld += (float)d1;
            }
            i19 += i20;
            i19 = (int)Test.instanceCount;
            for (i23 = 13; 379 > i23; i23++) {
                switch (((i23 % 1) * 5) + 56) {
                case 61:
                    i22 = i19;
                    d2 += i23;
                    break;
                default:
                    i22 += (i23 * i23);
                }
                i19 += (i23 * i23);
            }
            i19 += i20;
            i25 = 1;
            do {
                i22 *= (int)Test.fFld;
                i19 -= i23;
                Test.instanceCount += (((i25 * i20) + i25) - Test.fFld);
                switch ((((i21 >>> 1) % 6) * 5) + 84) {
                case 90:
                    i22 += (((i25 * Test.fFld) + Test.sFld) - byFld);
                    Test.instanceCount += (i25 * i25);
                    break;
                case 111:
                case 95:
                    Test.instanceCount += (((i25 * i21) + i22) - Test.instanceCount);
                    i24 += i22;
                    Test.sFld = (short)140;
                    i22 += (((i25 * i23) + i26) - i24);
                    break;
                case 100:
                    i19 *= 66;
                    byFld += (byte)(i25 * i25);
                    Test.fFld += i25;
                    break;
                case 92:
                    i19 = i19;
                    i24 += (i25 * i25);
                    break;
                case 87:
                    b2 = b2;
                    break;
                default:
                    fArr[i25] = i23;
                }
            } while ((i25 += 3) < 379);
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
