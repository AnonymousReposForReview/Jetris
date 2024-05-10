package tests.javafuzzer2214;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:22:43 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3774089966L;
    public static boolean bFld=false;
    public static byte byFld=-3;
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-19448);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i2=0, i3=-125, i4=28297, i5=-6, i6=6, iArr[]=new int[N];
        short s1=-20780;
        double d=-2.25413;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.925F);
        FuzzerUtils.init(iArr, -12);

        Test.instanceCount -= i2;
        s1 = (short)i2;
        for (i3 = 1; i3 < 276; i3++) {
            i2 += (i3 * i2);
        }
        Test.instanceCount *= 150;
        fArr[(i2 >>> 1) % N] -= Test.instanceCount;
        for (short s2 : Test.sArrFld) {
            i4 *= (int)d;
            for (i5 = 1; 4 > i5; ++i5) {
                float f=1.156F;
                f += -9L;
                i4 += (((i5 * Test.instanceCount) + Test.instanceCount) - f);
                iArr = iArr;
                i2 = (int)Test.instanceCount;
                i2 = -2;
                i6 = (int)2.471F;
            }
        }
        vMeth2_check_sum += i2 + s1 + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(short s) {

        int i1=101, i7=-2, i8=2, i9=-36384, i10=11293, i11=-35061, iArr1[]=new int[N];
        float f1=0.415F;

        FuzzerUtils.init(iArr1, -203);

        i1 = (-(i1++));
        vMeth2();
        i1 -= i1;
        i7 = 1;
        while (++i7 < 206) {
            iArr1 = iArr1;
            for (i8 = 1; i8 < 8; i8++) {
                i9 = i8;
                i9 += (((i8 * i9) + Test.instanceCount) - i8);
            }
            iArr1[i7 - 1] = i8;
            i1 += (int)f1;
            for (i10 = 1; i10 < 8; i10++) {
                if (Test.bFld) break;
                f1 = (float)-88.12356;
                i9 = (int)Test.instanceCount;
                f1 += f1;
            }
        }
        vMeth1_check_sum += s + i1 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i) {

        byte by=-99;
        float fArr1[]=new float[N];
        int iArr2[][]=new int[N][N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr1, 2.89F);
        FuzzerUtils.init(iArr2, 54521);
        FuzzerUtils.init(lArr, 593239001464146683L);

        i = (int)(Test.instanceCount++);
        vMeth1((short)(-10093));
        fArr1[(i >>> 1) % N] -= Test.instanceCount;
        by += (byte)Test.instanceCount;
        i = i;
        iArr2[(i >>> 1) % N][(i >>> 1) % N] *= -60889;
        i <<= i;
        iArr2[(i >>> 1) % N][(i >>> 1) % N] >>= i;
        lArr = lArr;
        vMeth_check_sum += i + by + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr2)
            + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i12=13625, i13=-52, i14=11, i15=144, i16=-14, i17=-63, i18=97, i19=-2, i20=-64, i21=-147, i22=12,
            iArr3[]=new int[N];
        float f2=-1.142F;
        boolean b=true, bArr[]=new boolean[N];
        long lArr1[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr1, -4481L);
        FuzzerUtils.init(dArr, 98.56177);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr3, 11);

        vMeth(-98);
        for (i12 = 4; i12 < 338; i12++) {
            for (i14 = 75; 3 < i14; --i14) {
                if (true) continue;
                for (i16 = 1; i16 < 2; i16++) {
                    Test.instanceCount = i15;
                    i18 -= i15;
                    if (Test.bFld) break;
                    lArr1[i16] = 0L;
                }
                switch ((i14 % 7) + 6) {
                case 6:
                    if (Test.bFld) continue;
                    break;
                case 7:
                    i13 = i14;
                    i17 = Test.byFld;
                    dArr[i14 - 1] *= f2;
                    for (i19 = 1; i19 < 2; i19++) {
                        bArr[i14 + 1] = Test.bFld;
                        if (b) break;
                        iArr3[i14] = i15;
                        i13 += (int)3433084173L;
                        f2 -= Test.instanceCount;
                        i15 -= (int)f2;
                        i17 -= i12;
                    }
                    break;
                case 8:
                    if (Test.bFld) {
                        i13 += 201;
                        if (true) {
                            for (i21 = 1; i21 < 2; i21++) {
                                lArr1[i21] -= i21;
                            }
                        }
                        f2 -= i18;
                    }
                    i18 += (i14 * i14);
                    i18 >>= -11824;
                case 9:
                    iArr3[i12 - 1] -= i22;
                    break;
                case 10:
                    dArr[i12] *= i12;
                    break;
                case 11:
                    Test.instanceCount += (i14 * i16);
                    break;
                case 12:
                    Test.instanceCount <<= i22;
                    break;
                default:
                    Test.instanceCount &= -49103;
                }
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